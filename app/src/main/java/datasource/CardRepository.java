package datasource;

import java.util.List;

import room.CardEntity;

public class CardRepository implements ICardDataSource {

    private ICardDataSource iCardDataSource;

    public CardRepository(ICardDataSource iCardDataSource) {
        this.iCardDataSource = iCardDataSource;
    }

    private static CardRepository instance;
    public static CardRepository getInstance(ICardDataSource iCardDataSource) {
        if (instance == null) {
            instance = new CardRepository(iCardDataSource);
        }
        return instance;
    }


    @Override
    public void insert(CardEntity cardEntity) {
        iCardDataSource.insert(cardEntity);
    }

    @Override
    public List<CardEntity> getAllcard() {
        return iCardDataSource.getAllcard();
    }
}
