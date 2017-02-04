package personal.common.api.framework.validation.validator;

import personal.common.api.framework.validation.MinLength;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 最小长度注解验证器
 *
 * @author anyone
 * @since 1.0.0
 */
public class MinLengthValidator implements ConstraintValidator<MinLength, String> {

    private int length;

    @Override
    public void initialize(MinLength constraintAnnotation) {
        length = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.length() >= length;
    }
}
