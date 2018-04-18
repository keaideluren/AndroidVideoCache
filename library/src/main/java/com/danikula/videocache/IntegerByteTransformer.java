package com.danikula.videocache;

/**
 * Created by Administrator 可爱的路人 on 2018/4/17.
 * Email:513421345@qq.com
 * TODO
 */
public class IntegerByteTransformer {

    public static byte[] integerToByte(int i) {
        byte[] result = new byte[4];
        for (int j = 0; j < 4; j++) {
            result[j] = (byte) (i & 0xff);
            i = i >>> 8;
        }
        return result;
    }

    public static int byteToInteger(byte[] ftypSizeBuffer) {
        int currSize = 0;
        if (ftypSizeBuffer == null) {
            return 0;
        }
        for (byte b : ftypSizeBuffer) {
            currSize = (currSize << 8) ^ (b & 0xff);
        }
        return currSize;
    }
}
