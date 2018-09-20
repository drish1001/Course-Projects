package com.example.android.quakereport;

class Earthquake {
        private double mMagnitude;

        private String mLocation;

        private long mTimeInMilliseconds;

        private String mUrl;

        public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
            mMagnitude = magnitude;
            mLocation = location;
            mTimeInMilliseconds = timeInMilliseconds;
            mUrl = url;
        }
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getLocation() {
        return mLocation;
    }
    public String getUrl() {
        return mUrl;
    }
    public long getMagnitude() {
        return mTimeInMilliseconds;
    }



}
