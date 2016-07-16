package org.literacyapp.dao;

import java.util.List;
import org.literacyapp.model.admin.Application;
import org.literacyapp.model.admin.ApplicationVersion;

import org.springframework.dao.DataAccessException;

public interface ApplicationVersionDao extends GenericDao<ApplicationVersion> {
    
    List<ApplicationVersion> readAll(Application application) throws DataAccessException;
}