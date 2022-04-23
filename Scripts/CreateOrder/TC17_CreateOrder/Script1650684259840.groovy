import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Buka Aplikasi\r\n'
Mobile.startApplication('C:\\Users\\user\\Downloads\\Laundry_POS_base.apk', false)

'tap icon +'
Mobile.tap(findTestObject('Navigation/NavAdd'), 0)

'set pelanggan yang beli'
Mobile.setText(findTestObject('Order/AddCustAndProduk/Order-SearchPelangganForm'), 'Aurora', 0)

'cek apakah list choose pertama ada\r\n'
Mobile.verifyElementExist(findTestObject('Order/AddCustAndProduk/Choose Pelanggan Teratas'), 0)

'tap elemen teratas jika ada\r\n'
Mobile.tap(findTestObject('Order/AddCustAndProduk/Choose Pelanggan Teratas'), 0)

Mobile.tap(findTestObject('Order/AddCustAndProduk/Btn-pilihPelanggan'), 0)

Mobile.verifyElementText(findTestObject('Order/AddCustAndProduk/PilihProduk-Tittle'), 'Pilih Produk')

Mobile.setText(findTestObject('Order/AddCustAndProduk/PilihProduk-SearchBox'), 'Tikar', 0)

Mobile.verifyElementExist(findTestObject('Order/AddCustAndProduk/Select Produk, teratas'), 0)

Mobile.tap(findTestObject('Order/AddCustAndProduk/Select Produk, teratas'), 0)

Mobile.setText(findTestObject('Order/AddCustAndProduk/PilihProduk-FormJumlah'), '3', 0)

Mobile.tap(findTestObject('Order/AddCustAndProduk/PillihProduk-SubmitKeranjang'), 0)

Mobile.tap(findTestObject('Order/AddCustAndProduk/PilihProduk-BtnLanjut'), 0)

