package org.ccy1277.nos_server.dao;

import java.util.Date;

public interface TransactionDao {
    Integer findTotalMonByTime(Date start, Date end);
}
