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

Mobile.startApplication('D:\\Apk Testing Mobile\\Laundry_POS_base.apk', false)

Mobile.tap(findTestObject('TC01_Menambah_edit_hapus_produk/TC01_Menambah data/android.widget.TextView - Menu'), 0)

Mobile.tap(findTestObject('TC01_Menambah_edit_hapus_produk/TC01_Menambah data/android.widget.TextView - Produk'), 0)

Mobile.tap(findTestObject('TC01_Menambah_edit_hapus_produk/TC01_Menambah data/android.widget.ImageView-Tambah Data'), 0)

Mobile.setText(findTestObject('TC01_Menambah_edit_hapus_produk/TC01_Menambah data/android.widget.EditText - Nama Produk'), 
    'Baju', 0)

Mobile.setText(findTestObject('TC01_Menambah_edit_hapus_produk/TC01_Menambah data/android.widget.EditText - Deskrpisi Produk'), 
    'Cuci dan Setrika', 0)

Mobile.setText(findTestObject('TC01_Menambah_edit_hapus_produk/TC01_Menambah data/android.widget.EditText - Harga'), '10000', 
    0)

Mobile.tap(findTestObject('TC01_Menambah_edit_hapus_produk/TC01_Menambah data/android.widget.RadioButton - Kg'), 0)

Mobile.tap(findTestObject('TC01_Menambah_edit_hapus_produk/TC01_Menambah data/android.widget.Button - Tambah Produk'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

