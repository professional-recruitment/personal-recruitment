package personal.common.api.framework.validation;

import personal.common.api.framework.validation.validator.GreaterThanValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 大于值注解
 *
 * @author anyone
 * @since 1.0.0
 */
@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GreaterThanValidator.class)
public @interface GreaterThan {

    String message() default "greater_than";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int value();
}
