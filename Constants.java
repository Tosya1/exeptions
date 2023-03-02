public class Constants {
    public static final String START_MSG = "Введите данные через пробел: Фамилия Имя Отчество датарождения номертелефона пол:";
    public static final String NO_DATA_ERR = "Вы не ввели данные. Повторите попытку";
    public static final String EXTRA_DATA_ERR = "Вы ввели слишком много данных. Пожалуйста, повторите попытку."; 
    public static final String INSUFF_DATA_ERR = "Вы ввели недостаточно данных. Пожалуйста, повторите попытку.";       
    public static final int PARAM_COUNT = 6;
    public static final int MIN_PHONE_LENGTH = 5;
    public static final String NAME_REGEX = "^([А-Я]{1}[а-яё]{1,23}|[A-Z]{1}[a-z]{1,23})$";
    public static final String BIRTHDATE_REGEX = "(0[1-9]|[12][0-9]|3[01])[.](0[1-9]|1[012])[.](19|20)\\d\\d";
    public static final String GENDER_REGEX = "^[fm]$";
    public static final String NAME_ERR_MSG = "Имя введено некорректно. Введите информацию повторно";
    public static final String LAST_NAME_ERR_MSG = "Фамилия введена некорректно. Введите информацию повторно";
    public static final String MIDDLE_NAME_ERR_MSG = "Отчество введено некорректно. Введите информацию повторно";
    public static final String BIRTHDATE_ERR_MSG = "Дата рождения должна соответствовать формату \"дд.мм.гггг\". Введите информацию повторно";
    public static final String PHONE_ERR_MSG = "Телефон может содержать только цифры. Введите информацию повторно";
    public static final String PHONE_LEN_ERR_MSG = "Телефон не может быть короче 5 цифр.Введите информацию повторно";
    public static final String GENDER_ERR_MSG = "Пол может иметь значения f или m. Введите информацию повторно";
}
