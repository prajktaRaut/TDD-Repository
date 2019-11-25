package com;

import com.moodanalyzer.RealMoodAnalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyzerFactory {
    public static RealMoodAnalyser createMoodAnalyzser(String message) {

        try {
            Class MoodAnalyserClass=Class.forName("com.moodanalyzer.RealMoodAnalyser");
            Constructor newConstructor=MoodAnalyserClass.getConstructor(String.class);
            Object myobj=newConstructor.newInstance(message);
            return (RealMoodAnalyser)myobj;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;

    }
}
