package ru.netology.data;

import lombok.Data;
import static ru.netology.data.DataGenerator.*;

@Data

public class RegistrationInfo {
    public RegistrationInfo() {
        generateName();
        generatePhone();
        generateCity();

    }
}
