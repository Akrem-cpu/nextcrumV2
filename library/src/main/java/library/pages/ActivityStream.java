package library.pages;

import library.utilities.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStream {
    public ActivityStream() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement userInfDiv;
    @FindBy(xpath = "//span[.='Log out']")
    public WebElement Logout;
    @FindBy(xpath = "//div[@class='feed-add-post-micro']")
    public WebElement messageBox;
    @FindBy(className = "bx-editor-iframe")
    public WebElement firstIframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBoxInsideIframeOne;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendMessage;

    @FindBy(xpath = "(//div[@class='workarea-content-paddings']//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement firstRecentlyPostedMessage;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement messageCancelButton;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement AddLinkButton;


    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveLinkAfterGivingALinkAndName;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkTextBoxToGiveATextToTheLink;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkUrlBoxToGiveAUrlForTheLink;

    @FindBy(xpath = "(//div[@class='workarea-content-paddings']//div[@class='feed-post-text-block-inner-inner'])[1]/a")
    public WebElement linkInsideThePostedText;
    @FindBy(xpath = "//div[@class='workarea-content-paddings']/div[3]/div[2]/div[1]//span[.='happy']")
    public WebElement firstOptionToSelectFromThePollVote;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']/div[3]/div[2]/div[1]//button[.='Vote']")
    public WebElement voteButton;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']/div[3]/div[2]/div[1]")
    public WebElement firstRecentPostedPoll;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']/div[3]/div[2]/div[1]//button[.='Vote again']")
    public WebElement voteAgainTxt;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']/div[3]/div[2]/div[1]//button[.='Stop']")
    public WebElement stopVoteForOnlyTheCreaterOfThePoll;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']")
    public WebElement poll;

    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement questionBoxForPollCreation;

    @FindBy(xpath = "//ol[@class='vote-answers']//li//input[contains(@placeholder,'Answer')]")
    public List<WebElement> listOfVoteAnswerForPollCreation;

    @FindBy(xpath = "//div[@class='vote-checkbox-wrap']/input")
    public WebElement multipleChoiceAllowButtonForPollCreation;


    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorMessageWhenTryingToCreatingPollWithOutTitle;

    @FindBy(xpath = "//span[@class='feed-new-message-inf-text']")
    public WebElement moreEvent;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestionWhenCreatingPoll;

    @FindBy(xpath = "//div[@class='vote-fields']//li[@class='vote-question']")
    public List<WebElement> allAddedQuestionWhenCreatedAPoll;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//input[@name='FIND']")
    public WebElement searchBox;
    @FindBy(xpath = "//span[@class='main-ui-item-icon main-ui-search']")
    public WebElement searchButton;
    @FindBy(xpath = "//div[@id='blg-post-img-3834']//div[@id='blog_post_body_3834']")
    public WebElement searchedPostOnlyForSearchPurposeNeedToChangeIfUsedAnotherSearchThing;

    @FindBy(xpath = "//div[@class='feed-wrap-empty']")
    public WebElement invalidSearch;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']//div[@class='feed-item-wrap'][1]//div[contains(@id,'bx-ilike-top-users')]")
    public WebElement firstPostToLikeComfrmation;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']//div[@class='feed-item-wrap'][1]//a[.='Like']")
    public WebElement likeButtonForTheFirstPost;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']//div[@class='feed-item-wrap'][1]//span[@class='feed-inform-follow']/a")
    public WebElement followButtonOnTheFirstMostRecentPost;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']//div[@class='feed-item-wrap'][1]//span[@class='feed-content-view-cnt-wrap']")
    public WebElement viewIconForTheMostRecentPost;

    @FindBy(xpath = "//div[@class='popup-window popup-window-contentview popup-window-close-animation-opacity']//a/span[2]")
    public WebElement peopleThatSeenThePostOnlyLoadOnThePageAfterYouClickOnTheViewButton;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']//div[@class='feed-item-wrap'][1]//div[contains(@class,'feed-post-important-switch')]")
    public WebElement addToFavoritesButtonForRecentPost;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']//div[@class='feed-item-wrap'][1]//div[@class='feed-com-main-content feed-com-block-old feed-com-block-read']")
    public WebElement firstCommentButtonForMostRecentPost;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']//div[@class='feed-item-wrap'][1]//a[.='Add comment']")
    public WebElement commentBoxOnTheMostRecentPost;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']//div[@class='feed-item-wrap'][1]//button[@class='ui-btn ui-btn-sm ui-btn-primary']")
    public WebElement sendCommentForTheMostRecentPost;
    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeForCommentText;
    @FindBy(xpath = "//body")
    public WebElement textBoxInsideCommentIframe;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']//div[@class='feed-item-wrap'][1]//button[@class='ui-btn ui-btn-sm ui-btn-link']")
    public WebElement cancelButtonForCommentForRecentPost;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-calendar']")
    public WebElement event;

    @FindBy(xpath = "//div[@class='workarea-content-paddings']//div[@class='feed-post-block feed-calendar-confirm feed-post-block-short feed-post-block-separator'][1]")
    public WebElement mostRecentPostedEvent;

    @FindBy(xpath = "//span[@class='feed-event-time ampm-width'][1]")
    public WebElement startTimeBoxForEvenCreation;

    @FindBy(xpath = "//div[@id='feed_cal_event_from_timecal_3Jcl_div']//input[@title='Hours']")
    public WebElement startTimeBoxTOChangeTime;

    @FindBy(xpath ="//span[@class='feed-event-time ampm-width'][2]" )
    public WebElement endTimeBoxForEventCreation;
    @FindBy(xpath = "//div[@id='feed_cal_event_to_timecal_3Jcl_div']//input[@title='Hours']")
    public WebElement endTimeBoxToChangeTime;

    @FindBy(xpath = "//div[@id='feed_cal_event_to_timecal_3Jcl_div']//input[@value='Set Time']")
    public WebElement setEndTimeForEvenCreation;

    @FindBy(xpath = "//div[@id='feed_cal_event_from_timecal_3Jcl_div']//input[@value='Set Time']")
    public WebElement setStartTimeForEventCreation;

    @FindBy(xpath = "//div[@class='bxc-title'][1]")
    public WebElement timeTextForStartTime;

    @FindBy(xpath = "//div[@class='bxc-title'][2]")
    public List<WebElement> timeTextForEndTime;

    @FindBy(xpath = "//input[@id='event-full-daycal_3Jcl']")
    public WebElement allDayButtonForEventCreation;
    @FindBys({@FindBy (how = How.ID_OR_NAME ,using = "dlkasjf"),@FindBy(className = "kjahsdf")})
    public WebElement hello;

    public static void main(String[] args) {
        ActivityStream activityStream = new ActivityStream();
        System.out.println("activityStream.timeTextForEndTime.size() = " + activityStream.timeTextForEndTime.size());
    }




}
