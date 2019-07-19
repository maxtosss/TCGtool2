package datasource;

import java.util.List;

import room.CardDAO;
import room.CardEntity;

public class CardDataSource implements ICardDataSource {

    private CardDAO cardDao;
    private static CardDataSource instance;

    public CardDataSource(CardDAO cardDao) {this.cardDao = cardDao;}

    public static CardDataSource getInstance(CardDAO cardDao) {
        if (instance ==null){
            instance = new CardDataSource(cardDao);
        }
        return instance;
    }


    @Override
    public void insert(CardEntity cardEntity) {
        cardDao.insert(cardEntity);
    }

    @Override
    public List<CardEntity> getAllcard() {
        return cardDao.getAllcard();
    }
}
