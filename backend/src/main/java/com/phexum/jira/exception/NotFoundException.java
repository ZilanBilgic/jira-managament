package com.phexum.jira.exception;

import javax.persistence.EntityNotFoundException;

public class NotFoundException extends EntityNotFoundException {

    public NotFoundException(String id) {
        super("Entity bulunamad─▒. id : " + id);
    }

    public NotFoundException(Long id) {
        super("Entity bulunamad─▒. id : " + id);
    }

}
