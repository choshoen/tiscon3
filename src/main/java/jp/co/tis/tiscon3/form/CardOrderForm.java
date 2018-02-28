package jp.co.tis.tiscon3.form;

import jp.co.tis.tiscon3.entity.CardOrder;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    @NotBlank
    @Size(max = 60)
    private String kanjiName;
    private String kanjiName1;

    @NotBlank
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaName;
    private String kanaName1;
    @NotBlank
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetName;
    private String alphabetName1;

    @NotBlank
    private String yearOfBirth;

    @NotBlank
    private String monthOfBirth;

    @NotBlank
    private String dayOfBirth;

    @NotBlank
    @Size(max = 6)
    private String gender;

    @NotBlank
    @Size(max = 3)
    @Pattern(regexp = "^[0-9]{3}$")
    private String zipCode;

    @NotBlank
    @Size(max = 4)
    @Pattern(regexp = "[0-9]{4}")
    private String zipCode1;

    @NotBlank
    @Size(max = 255)
    private String address;

    /*@NotBlank
    @Size(max = 13)
    @Pattern(regexp = "^0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4}$")*/
    @NotBlank
    @Size(max = 3)
    @Pattern(regexp = "^0[0-9]{1,3}")
    private String homePhoneNumber;
    @NotBlank
    @Size(max = 4)
    @Pattern(regexp = "[0-9]{2,4}")
    private String homePhoneNumber1;
    @NotBlank
    @Size(max = 4)
    @Pattern(regexp = "[0-9]{4}$")
    private String homePhoneNumber2;

    /*@Size(max = 13)
    @Pattern(regexp = "^((070|080|090)-[0-9]{4}-[0-9]{4})?$")*/
    @Size(max = 3)
    @Pattern(regexp = "^(070|080|090)")
    private String mobilePhoneNumber;
    @Size(max = 4)
    @Pattern(regexp = "[0-9]{4}")
    private String mobilePhoneNumber1;
    @Size(max = 4)
    @Pattern(regexp = "[0-9]{4}")
    private String mobilePhoneNumber2;

    @NotBlank
    @Size(max = 255)
    @Email
    private String emailAddress;

    @NotBlank
    @Size(max = 20)
    private String spouse;

    @NotBlank
    @Size(max = 20)
    private String houseClassification;

    @NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String debt;

    @NotBlank
    @Size(max = 120)
    private String job;

    @NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String income;

    @Size(max = 255)
    private String employerName;


    @NotBlank
    @Size(max = 3)
    @Pattern(regexp = "^[0-9]{3}$")
    private String employerZipCode;

    @NotBlank
    @Size(max = 4)
    @Pattern(regexp = "^[0-9]{4}$")
    private String employerZipCode1;

    @Size(max = 255)
    private String employerAddress;

    /*@Size(max = 13)
    @Pattern(regexp = "^(0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4})?$")*/
    @Size(max = 3)
    @Pattern(regexp = "0[0-9]{1,3}")
    private String employerPhoneNumber;
    @Size(max = 4)
    @Pattern(regexp = "[0-9]{2,4}")
    private String employerPhoneNumber1;
    @Size(max = 4)
    @Pattern(regexp = "[0-9]{4}")
    private String employerPhoneNumber2;

    @Size(max = 255)
    private String industryType;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String capital;

    @Size(max = 255)
    @Pattern(regexp = "[0-9]*")
    private String companySize;

    @Size(max = 255)
    private String position;

    @Size(max = 255)
    private String department;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String employeeLength;

}
