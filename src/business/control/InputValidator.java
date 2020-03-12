package business.control;

import util.BusinessValidationException;

/**
 * Usa o padrão de projeto Strategy.
 */
public interface InputValidator {
    void validate(String input) throws BusinessValidationException;
}