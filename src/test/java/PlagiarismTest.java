import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PlagiarismTest {

    @Test
    public void TheRaven() {
        Detector detector = new Detector("Once upon a midnight dreary, while I pondered, weak and weary", 101);

        assertEquals(0, detector.search("Once upon a midnight dreary, while I pondered, weak and weary,\r\n" +
                        "Over many a quaint and curious volume of forgotten lore—\r\n" +
                        "    While I nodded, nearly napping, suddenly there came a tapping,\r\n" +
                        "As of some one gently rapping, rapping at my chamber door.\r\n" +
                        "“'Tis some visitor,” I muttered, “tapping at my chamber door—\r\n" +
                        "            Only this and nothing more.”\r\n" + //
                        "\r\n" +
                        "    Ah, distinctly I remember it was in the bleak December;\r\n" +
                        "And each separate dying ember wrought its ghost upon the floor.\r\n" +
                        "    Eagerly I wished the morrow;—vainly I had sought to borrow\r\n" +
                        "    From my books surcease of sorrow—sorrow for the lost Lenore—\r\n" +
                        "For the rare and radiant maiden whom the angels name Lenore—\r\n" +
                        "            Nameless here for evermore.\r\n" + //
                        "\r\n" + 
                        "    And the silken, sad, uncertain rustling of each purple curtain\r\n" +
                        "Thrilled me—filled me with fantastic terrors never felt before;\r\n" +
                        "    So that now, to still the beating of my heart, I stood repeating\r\n" +
                        "    “'Tis some visitor entreating entrance at my chamber door—\r\n" +
                        "Some late visitor entreating entrance at my chamber door;—\r\n" +
                        "            This it is and nothing more.”\r\n" +
                        "\r\n" +
                        "    Presently my soul grew stronger; hesitating then no longer,\r\n" +
                        "“Sir,” said I, “or Madam, truly your forgiveness I implore;\r\n" +
                        "    But the fact is I was napping, and so gently you came rapping,\r\n" +
                        "    And so faintly you came tapping, tapping at my chamber door,\r\n" +
                        "That I scarce was sure I heard you”—here I opened wide the door;—\r\n" +
                        "            Darkness there and nothing more.\r\n" + //
                        "\r\n" +
                        "    Deep into that darkness peering, long I stood there wondering, fearing,\r\n" +
                        "Doubting, dreaming dreams no mortal ever dared to dream before;\r\n" +
                        "    But the silence was unbroken, and the stillness gave no token,\r\n" +
                        "    And the only word there spoken was the whispered word, “Lenore?”\r\n" +
                        "This I whispered, and an echo murmured back the word, “Lenore!”—\r\n" +
                        "            Merely this and nothing more."));
    }

    @Test
    public void RichardII() {
        Detector detector = new Detector("Of watery Neptune, is now bound in with shame", 101);

        assertEquals(1008, detector.search("“This royal throne of kings, this scepter'd isle,\r\n" +
                        "This earth of majesty, this seat of Mars,\r\n" +
                        "This other Eden, demi-paradise,\r\n" +
                        "This fortress built by Nature for herself\r\n" +
                        "Against infection and the hand of war,\r\n" +
                        "This happy breed of men, this little world,\r\n" +
                        "This precious stone set in the silver sea,\r\n" +
                        "Which serves it in the office of a wall\r\n" +
                        "Or as a moat defensive to a house,\r\n" +
                        "Against the envy of less happier lands,\r\n" +
                        "This blessed plot, this earth, this realm, this England,\r\n" +
                        "This nurse, this teeming womb of royal kings,\r\n" +
                        "Fear'd by their breed and famous by their birth,\r\n" +
                        "Renowned for their deeds as far from home,\r\n" +
                        "For Christian service and true chivalry,\r\n" +
                        "As is the sepulchre in stubborn Jewry\r\n" +
                        "Of the world's ransom, blessed Mary's Son,\r\n" +
                        "This land of such dear souls, this dear dear land,\r\n" +
                        "Dear for her reputation through the world,\r\n" +
                        "Is now leased out, I die pronouncing it,\r\n" +
                        "Like to a tenement or pelting farm:\r\n" +
                        "England, bound in with the triumphant sea,\r\n" +
                        "Whose rocky shore beats back the envious siege\r\n" +
                        "Of watery Neptune, is now bound in with shame,\r\n" +
                        "With inky blots and rotten parchment bonds:\r\n" +
                        "That England, that was wont to conquer others,\r\n" +
                        "Hath made a shameful conquest of itself.\r\n" +
                        "Ah, would the scandal vanish with my life,\r\n" +
                        "How happy then were my ensuing death!”"));
    }

    @Test
    public void TheRoadNotTaken() {
        Detector detector = new Detector("And that has made all the difference", 101);

        assertEquals(714, detector.search("Two roads diverged in a yellow wood,\r\n" + 
                        "And sorry I could not travel both\r\n" + 
                        "And be one traveler, long I stood\r\n" + 
                        "And looked down one as far as I could\r\n" + 
                        "To where it bent in the undergrowth;\r\n" + 
                        "\r\n" +
                        "Then took the other, as just as fair,\r\n" + 
                        "And having perhaps the better claim,\r\n" + 
                        "Because it was grassy and wanted wear;\r\n" + 
                        "Though as for that the passing there\r\n" + 
                        "Had worn them really about the same,\r\n" + 
                        "\r\n" +
                        "And both that morning equally lay\r\n" + 
                        "In leaves no step had trodden black.\r\n" + 
                        "Oh, I kept the first for another day!\r\n" + 
                        "Yet knowing how way leads on to way,\r\n" + 
                        "I doubted if I should ever come back.\r\n" + 
                        "\r\n" + 
                        "I shall be telling this with a sigh\r\n" + 
                        "Somewhere ages and ages hence:\r\n" + 
                        "Two roads diverged in a wood, and I—\r\n" + 
                        "I took the one less traveled by,\r\n" + 
                        "And that has made all the difference."));
    }
    
    @Test
    public void Hamlet(){
        Detector detector = new Detector ("To be, or not to be, that is the question:", 101);

        assertEquals(0, detector.search("To be, or not to be, that is the question:\r\n" +
                    "Whether 'tis nobler in the mind to suffer \r\n" +
                    "The slings and arrows of outrageous fortune, \r\n" +
                    "Or to take arms against a sea of troubles \r\n" + 
                    "And by opposing end them. To die—to sleep, \r\n" + 
                    "No more; and by a sleep to say we end \r\n" +
                    "The heart-ache and the thousand natural shocks \r\n" + 
                    "That flesh is heir to: 'tis a consummation \r\n" +
                    "Devoutly to be wish'd. To die, to sleep; \r\n" +
                    "To sleep, perchance to dream—ay, there's the rub: \r\n" +
                    "For in that sleep of death what dreams may come, \r\n" +
                    "When we have shuffled off this mortal coil, \r\n" +
                    "Must give us pause—there's the respect \r\n" +
                    "That makes calamity of so long life. \r\n" +
                    "For who would bear the whips and scorns of time, \r\n" +
                    "Th'oppressor's wrong, the proud man's contumely, \r\n" +
                    "The pangs of dispriz'd love, the law's delay, \r\n" +
                    "The insolence of office, and the spurns \r\n" +
                    "That patient merit of th'unworthy takes, \r\n" +
                    "When he himself might his quietus make \r\n" +
                    "With a bare bodkin? Who would fardels bear,\r\n" +
                    "To grunt and sweat under a weary life, \r\n" +
                    "But that the dread of something after death, \r\n" +
                    "The undiscovere'd country, from whose bourn \r\n" +
                    "No traveller returns, puzzles the will, \r\n" +
                    "And makes us rather bear those ills we have \r\n" +
                    "Than fly to others that we know not of? \r\n" +
                    "Thus conscience doth make cowards of us all, \r\n" +
                    "And thus the native hue of resolution \r\n" +
                    "Is sicklied o'er with the pale cast of thought, \r\n" +
                    "And enterprises of great pith and moment \r\n" +
                    "With this regard their currents turn awry \r\n" +
                    "And lose the name of action.\r\n"));
    }

    @Test
    public void Ozymandias(){
        Detector detector = new Detector("My name is Ozymandias, King of Kings;", 101);

        assertEquals(442, detector.search("I met a traveller from an antique land, \r\n" +
                    "Who said—“Two vast and trunkless legs of stone \r\n" +
                    "Stand in the desert. . . . Near them, on the sand, \r\n" + 
                    "Half sunk a shattered visage lies, whose frown, \r\n" +
                    "And wrinkled lip, and sneer of cold command, \r\n" +
                    "Tell that its sculptor well those passions read \r\n" +
                    "Which yet survive, stamped on these lifeless things, \r\n" +
                    "The hand that mocked them, and the heart that fed; \r\n" +
                    "And on the pedestal, these words appear: \r\n" +
                    "My name is Ozymandias, King of Kings; \r\n" +
                    "Look on my Works, ye Mighty, and despair! \r\n" +
                    "Nothing beside remains. Round the decay \r\n" +
                    "Of that colossal Wreck, boundless and bare \r\n" +
                    "The lone and level sands stretch far away. \r\n"));
    }
}
