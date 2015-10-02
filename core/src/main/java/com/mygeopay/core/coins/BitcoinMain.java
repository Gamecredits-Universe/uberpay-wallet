package com.mygeopay.core.coins;

import com.mygeopay.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class BitcoinMain extends CoinType {
    private BitcoinMain() {
        id = "bitcoin.main";

        addressHeader = 0; // public key address
        p2shHeader = 5;    // script address
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 128;

        family = BitFamily.get();
        name = "Bitcoin";
        symbol = "BTC";
        uriScheme = "bitcoin";
        bip44Index = 0;
        unitExponent = 8;
        feePerKb = value(10000);
        minNonDust = value(5460);
        softDustLimit = value(1000000); // 0.01 BTC
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
    }

    private static BitcoinMain instance = new BitcoinMain();
    public static synchronized BitcoinMain get() {
        return instance;
    }
}
