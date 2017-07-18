import org.burnmydread.bolivar.pageobjects.utils.EncryptionDomainObject
import org.burnmydread.bolivar.pageobjects.utils.EncryptionUtil

def encryptionSettings = new EncryptionDomainObject(algorithm: 'AES', secretKeyText: 'upgrade6543platformbuckedFlintq4')
test_string = new File('/home/zach/src/bolivar/data/license_info/cert').text
output_file = new File('/home/zach/src/bolivar/data/license_info/cert.cpt')
//println EncryptionUtil.encrypt(test_string, encryptionSettings)

output_file.write(EncryptionUtil.encrypt(test_string, encryptionSettings))

println EncryptionUtil.decrypt(output_file.text, encryptionSettings)