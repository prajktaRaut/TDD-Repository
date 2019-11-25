package com.moodanalyzer;

import com.MoodAnalysisException;

public class RealMoodAnalyser {

    private String message;

    public RealMoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMethod(String message) throws MoodAnalysisException {

        this.message=message;
        return analyseMethod();

    }

    public String analyseMethod() throws MoodAnalysisException {
        try {

                if (message.contains("Sad"))
                    return "SAD";
                else
                    return "Happy";
            }
        catch(NullPointerException e)
        {
            throw new MoodAnalysisException("Please enter proper input");

        }
    }

    public boolean equals(RealMoodAnalyser another)
    {
        if (this.message.equals(((RealMoodAnalyser)another).message))
            return true;
        return false;



    }


}
