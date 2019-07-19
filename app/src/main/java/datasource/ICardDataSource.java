package datasource;

import java.util.List;

import room.CardEntity;

public interface ICardDataSource {
    void insert(CardEntity cardEntity);

    List<CardEntity> getAllcard();
}
