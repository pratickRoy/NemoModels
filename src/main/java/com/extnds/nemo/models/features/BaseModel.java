package com.extnds.nemo.models.features;

import com.extnds.nemo.models.commons.exceptions.ValidationException;
import lombok.Getter;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Getter
public class BaseModel {

    public void validate() throws ValidationException {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<BaseModel>> violations = validator.validate(this);
        if(!violations.isEmpty()) {
            throw new ValidationException(violations);
        }
    }
}
