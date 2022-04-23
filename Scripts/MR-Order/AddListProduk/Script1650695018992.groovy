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

Mobile.startExistingApplication('com.cancreative.laundrypos', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Req-Order/Produk/Nav-Menu'), 0)

Mobile.tap(findTestObject('Req-Order/Produk/Menu-Produk'), 0)

for (int i = 0; i < 3; i++) {
    Mobile.tap(findTestObject('Req-Order/Produk/Btn-AddProduk'), 0)

    Mobile.setText(findTestObject('Req-Order/Produk/TmbhPdk-Nama'), nama[i], 0)

    Mobile.setText(findTestObject('Req-Order/Produk/TmbhPdk-Deskripsi'), desc[i], 0)

    Mobile.setText(findTestObject('Req-Order/Produk/TmbhPdk-Harga'), harga[i], 0)

    Mobile.tap(findTestObject('Req-Order/Produk/Radio-Satuan-Kg'), 0)

    Mobile.tap(findTestObject('Req-Order/Produk/Submit-Tambah-Produk'), 0)
}

