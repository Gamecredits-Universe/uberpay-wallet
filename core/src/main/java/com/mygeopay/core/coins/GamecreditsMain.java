package com.mygeopay.core.coins;

import com.mygeopay.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class GamecreditsMain extends CoinType {
    private GamecreditsMain() {
        id = "gamecredits.main";

        addressHeader = 38; // public key address
        p2shHeader = 5;    // script address
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 176;

        family = BitFamily.get();
        name = "GAME";
        fullname = "Gamecredits";
        symbol = "GAME";
        uriScheme = "gamecredits";
        bip44Index = X; 
        unitExponent = 8;
        feePerKb = value(100000);
        minNonDust = value(1000); // 0.00001 GAME mininput
        softDustLimit = value(100000); // 0.001 GAME
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static GamecreditsMain instance = new GamecreditsMain();
    public static synchronized GamecreditsMain get() {
        return instance;
    }
}
