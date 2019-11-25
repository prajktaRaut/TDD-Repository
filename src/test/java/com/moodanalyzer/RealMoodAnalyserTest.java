package com.moodanalyzer;


import com.MoodAnalysisException;
import com.MoodAnalyzerFactory;
import com.ObjectReflector;
import com.moodanalyzer.RealMoodAnalyser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RealMoodAnalyserTest {

    @Test
    public void giveMessage_WhenSad_ShouldReturnSad()
    {
        RealMoodAnalyser realMoodAnalyser = new RealMoodAnalyser(null);
        String mood = null;
        try {
            mood = realMoodAnalyser.analyseMethod("This is a Sad Message");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void giveMessage_WhenSad_ShouldReturnHappy()
    {
        RealMoodAnalyser realMoodAnalyser = new RealMoodAnalyser(null);
        String mood= null;
        try {
            mood = realMoodAnalyser.analyseMethod("This is happy message");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Happy",mood);



    }

    @Test
    public void giveNullPointerException() {
        RealMoodAnalyser realmoodanalyzer=new RealMoodAnalyser(null);
        //String mood= null;
        try {

            ExpectedException expectedException=ExpectedException.none();
            expectedException.expect(MoodAnalysisException.class);
             realmoodanalyzer.analyseMethod(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("Please enter proper input",e.getMessage());
        }

    }

    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturnObject() {

        RealMoodAnalyser realMoodAnalyser= MoodAnalyzerFactory.createMoodAnalyzser("I am in happy mood");
        
        Assert.assertEquals(new RealMoodAnalyser("I am in happy mood"),realMoodAnalyser);

    }

    @Test
    public void givenMethod_ForDebuging() {

        RealMoodAnalyser realMoodAnalyser=new RealMoodAnalyser("I am in debug mode");

        ObjectReflector.dump(realMoodAnalyser,0);


    }
}
