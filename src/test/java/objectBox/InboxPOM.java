package objectBox;

import org.openqa.selenium.By;

public interface InboxPOM {
	public static By txtSearchBar = By.xpath("//*[text()='Search']");

	public static By switchDefaultView = By.xpath("//*[text()='Default']");
	public static By switchSmartView = By.xpath("//*[text()='Smart Views']");

	public static By listContainsCount = By.xpath("//*[contains(@class,'-full cursor-pointer')]");// 1-10
	public static By headerInbox = By.xpath("//div[text()='Inbox']");
	public static By btnInbox = By.xpath("//span[text()='Inbox']");
	public static By btnCompose = By.xpath("//*[text()='Compose']");
	public static By btnStarred = By.xpath("//*[text()='Starred']");
	public static By btnSent = By.xpath("//*[text()='Sent']");
	public static By btnDraft = By.xpath("//*[text()='Draft']");
	public static By btnPriority = By.xpath("//*[text()='Priority']");
	public static By btnSnoozed = By.xpath("//*[text()='Snoozed']");
	public static By btnMyTasks = By.xpath("(//h3//button)[1]");
	public static By btnDiscard = By.xpath("(//h3//button)[2]");
	public static By checkAllSelect = By.xpath("(//*[@role='checkbox'])[1]");

	public static By selectCheckOption = By.xpath("//*[@class='flex items-center gap-1']");
	public static By listSelectCheckOption = By.xpath("//*[@class='flex items-center gap-1']//button");// 1-9
	public static By btnFocused = By.xpath("//div[text()='Focused']/parent::div");
	public static By btnAll = By.xpath("//div[text()='All']/parent::div");

	public static By btnProfile = By.xpath("//button[contains(@data-sentry-source-file,'ProfileDrop')]");
	public static By lblUserName = By.xpath("//div/child::p[@class='font-medium']");

	public static By btnHelp = By.xpath("(//div[contains(@class,'w-max h-full px-3')])[1]");
	public static By btnNotifications = By.xpath("(//div[contains(@class,'w-max h-full px-3')])[2]");
	public static By btnConv = By.xpath("//div[@id='conversations']");
	public static By btnCalander = By.xpath("//div[@id='calendar']");

	public static By txtSearchBySender = By.xpath("//input[@placeholder='Enter sender']");
	public static By txtSearchByReceiver = By.xpath("//input[@placeholder='Enter receiver']");
	public static By txtSearchBySubject = By.xpath("//input[contains(@placeholder,'Subject')]");
	public static By txtSearchByWordsIncl = By.xpath("//input[contains(@placeholder,'which are there in email')]");
	public static By txtSearchByWordsExcl = By.xpath("//input[contains(@placeholder,'which are not there in email')]");
	public static By searchResults = By.xpath("(//*[contains(@class,'text-[#191919] f')])[2]");
	public static By searchResultList = By.xpath("//*[contains(@class,'text-[#191919] f')]");
	public static By chkHasAttachments = By.xpath("(//*[@role='checkbox'])[12]");
	public static By btnSelectSize = By.xpath("//button[@dir='ltr']");
	public static By btnSelectEquals = By.xpath("(//div[@role='option'])[3]");
	public static By btnReset = By.xpath("//button[text()='Reset']");
	public static By btnSearch = By.xpath("//button[text()='Search']");

	public static By lblSenderNames = By.xpath("//*[contains(@class,'font-bold w-32')]"); // list 1-10

	public static By tabConv = By.id("conversations");
	public static By tabInsights = By.id("insights");
	public static By tabCalendar = By.id("calendar");
	public static By btnCreateEvent = By.xpath("//button[text()='Create Event ']");
	public static By tabLabels = By.id("labels");
	public static By tabCrm = By.id("crm-beta");
	public static By tabMailboxes = By.id("mailboxes");
	public static By tabDrive = By.id("drive");
	public static By tabTemplates = By.id("templates");
	public static By tabAutomation = By.id("automation");

	public static By callOutPin = By.xpath("//*[@id='radix-:r20t:']");
	public static By callOutDelete = By.xpath("(//*[@data-state='delayed-open'])[2]");

	public static By btnDeleteMail = By.xpath("(//*[@class='flex gap-4 items-center']//div)[3]");
	public static By popUpDeleteMail = By.xpath("//*[@role='alertdialog']");
	public static By btnContinueDelete = By.xpath("//*[text()='Continue']");

	public static By tabTrash = By.xpath("(//*[@class='flex items-center justify-between'])[9]");

	public static By trashContent1 = By.xpath("(//*[contains(@class,'text-[#191919] f')])[1]");
	public static By trashContentlist = By.xpath("//*[contains(@class,'text-[#191919] f')]");
	public static By searchResultText = By.xpath("(//*[contains(@class,'text-[#191919] fon')])[2]");

}
