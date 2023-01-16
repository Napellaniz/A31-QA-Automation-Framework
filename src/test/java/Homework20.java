import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework20 extends BaseTest {

    @Test
            public void addSongToPlaylist() throws InterruptedException {

        provideEmail("demo@class.com");

        providePassword("te$t$tudent");

        clickSubmit();

        searchSong("Pluto");

        viewAllSearchResults();

        viewAllFirstSongResult();

        clickAddToButton();

        choosePlaylist("Test Pro Playlist");

        Assert.assertTrue(isNotificationPopUpPresent());
    }



}