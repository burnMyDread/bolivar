package org.burnmydread.bolivar.pageobjects.utils

import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import java.security.Key

/**
 * Created by zach on 7/17/17.
 */
class EncryptionDomainObject {
    String algorithm
    String secretKeyText

    Key getKey() {
        new SecretKeySpec(secretKeyText.getBytes(), algorithm)
    }

    Cipher getCihper() {
        Cipher.getInstance(algorithm)
    }
}
