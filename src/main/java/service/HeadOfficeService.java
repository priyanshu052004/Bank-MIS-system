package service;

import model.HeadOfficeEntity;

import java.sql.Connection;

public interface HeadOfficeService {
    static void displayAllRecords(Connection con) {
    }

    void createHeadOffRecord(Connection con, HeadOfficeEntity headOfficeEntity);
}
