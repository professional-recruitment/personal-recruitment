package personal.common.api.framework.validation;

import personal.common.api.framework.validation.validator.NotEmptyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 非空注解
 *
 * @author anyone
 * @since 1.0.0
 */
@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotEmptyValidator.class)
public @interface NotEmpty {

    String message() default "not_empty";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
