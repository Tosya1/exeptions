import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    String[] data;
    Person person;

    public App() {
        this.data = getData(Constants.START_MSG, Constants.PARAM_COUNT);
        this.person = new Person();
    }


    public void run () {
        setPerson();
        writeToFile();
    }

    public void setPerson() {
        this.person.setLastName(getProperty(this.data[0], Constants.NAME_REGEX, Constants.LAST_NAME_ERR_MSG));
        this.person.setName(getProperty(this.data[1], Constants.NAME_REGEX, Constants.NAME_ERR_MSG));
        this.person.setMiddleName(getProperty(this.data[2], Constants.NAME_REGEX, Constants.MIDDLE_NAME_ERR_MSG)); 
        this.person.setBirthDate(getProperty(this.data[3], Constants.BIRTHDATE_REGEX, Constants.BIRTHDATE_ERR_MSG));
        this.person.setPhone(getPhone(this.data[4]));  
        this.person.setGender(getProperty(this.data[5], Constants.GENDER_REGEX, Constants.GENDER_ERR_MSG).charAt(0));
    }

    private static String getProperty(String name, String regex, String errMsg) {
        if (!checkValue(name, regex, errMsg)){
            name = getProperty(View.getInfo(), regex, errMsg);
        }
        return name;
    }

    private static int getPhone(String str) {
        try {
            if (str.length() >= Constants.MIN_PHONE_LENGTH) {
                return Integer.parseInt(str);               
            } else {
                View.print(Constants.PHONE_LEN_ERR_MSG);
                return getPhone(View.getInfo());
            }

        } catch (NumberFormatException e) {
            View.print(Constants.PHONE_ERR_MSG);
            return getPhone(View.getInfo());
        }
    }

    private static String getValue(String str) {
        View.print(str);
        String data = View.getInfo();
        if (data.isEmpty()){
            View.print(Constants.NO_DATA_ERR);
            data = getValue(str);
        }
        return data;
    }

    private static String[] getData(String str, int count) {
        String data = getValue(str);
        String[] arr = data.split(" ");
        int code = checkCount(arr, count);
        if (code!= 0){
            showInfo(code);
            arr = getData(str, count);
        }
        return arr;
    }

    private static int checkCount(String[] arr, int count) {
        if (arr.length > count) return 1;
        else if (arr.length < count) return -1;
        else return 0;
    }

    private static boolean checkValue(String value, String regex, String errMsg) {
        if (!value.matches(regex)){
            View.print(errMsg);
            return false;
        } else {
            return true;
        }
    }

    private static void showInfo(int code) {
        if (code == 1) {
            System.out.println(Constants.EXTRA_DATA_ERR);
        } else if (code == -1) {
            System.out.println(Constants.INSUFF_DATA_ERR);
        }
    }

    public void writeToFile () {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.person.lastName +  ".txt", true))) {
            bw.write(this.person.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
