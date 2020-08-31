package com.dragon.apnglibrary

import java.io.ByteArrayOutputStream

/**
 * @author dragon
 */
internal class ByteArrayOutputStreamExt : ByteArrayOutputStream() {
    fun buffer(): ByteArray {
        return buf
    }
}