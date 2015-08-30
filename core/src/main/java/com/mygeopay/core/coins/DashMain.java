package com.mygeopay.core.coins;

import com.mygeopay.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class DashMain extends CoinType {
    private DashMain() {
        id = "darkcoin.main"; // Do not change this id as wallets serialize this string

        addressHeader = 76; // p2pkh_version = 76
        p2shHeader = 16; // p2sh_version = 16
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;

        family = BitFamily.get();
        name = "DASH";
        symbol = "DASH";
        uriScheme = "dash"; // TODO add multi uri, darkcoin
        bip44Index = 5; //  chain_index = 5
        unitExponent = 8; // base units DASH, mDASH, uDASH
        feePerKb = value(100000);
        minNonDust = value(1000); // 0.00001 DASH mininput
        softDustLimit = value(100000); // 0.001 DASH
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static DashMain instance = new DashMain();
    public static synchronized DashMain get() {
        return instance;
    }
}
