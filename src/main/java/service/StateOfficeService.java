package service;

import model.StateOfficeEntity;

import java.sql.Connection;

public interface StateOfficeService {
    void createStateOffRecord(Connection con, StateOfficeEntity stateOfficeEntity);

    void updateAdd(Connection con, StateOfficeEntity stateOfficeEntity);

    void delete(Connection con , StateOfficeEntity stateOfficeEntity);
}
