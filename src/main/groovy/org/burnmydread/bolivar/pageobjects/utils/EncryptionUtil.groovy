package org.burnmydread.bolivar.pageobjects.utils

import org.apache.commons.codec.binary.Hex

import javax.crypto.Cipher

/**
 * Created by zach on 7/17/17.
 */
class EncryptionUtil {

    static encrypt(String data, EncryptionDomainObject domain) {
        Cipher cipher = domain.cihper
        cipher.init(Cipher.ENCRYPT_MODE, domain.key)
        new String(Base64.encoder.encode(cipher.doFinal(data.getBytes('UTF-8'))))
    }

    static decrypt( data, EncryptionDomainObject domain) {
        Cipher cipher = domain.cihper
        cipher.init(Cipher.DECRYPT_MODE, domain.key)
        new String(cipher.doFinal(Base64.getDecoder().decode(data.getBytes('UTF-8'))))
    }
}
