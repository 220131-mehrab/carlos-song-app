package com.github.KarlitosTaquitos.songapp;

public class Song {
    private String songId, songName, artistId, artistName, popularity, explicit, songType, trackNumber, numArtists, numAvailableMarkets, releaseDate, durationMs, key, mode, timeSignature, acousticness, danceability, energy, instrumentalness, liveness, loudness, speechiness, valence, tempo;

    public Song(String songName, String artistId, String artistName, String popularity, String explicit, String songType, String trackNumber, String numArtists, String numAvailableMarkets, String releaseDate, String durationMs, String key, String mode, String timeSignature, String acousticness, String danceability, String energy, String instrumentalness, String liveness, String loudness, String speechiness, String valence, String tempo) {
        this.songName = songName;
        this.artistId = artistId;
        this.artistName = artistName;
        this.popularity = popularity;
        this.explicit = explicit;
        this.songType = songType;
        this.trackNumber = trackNumber;
        this.numArtists = numArtists;
        this.numAvailableMarkets = numAvailableMarkets;
        this.releaseDate = releaseDate;
        this.durationMs = durationMs;
        this.key = key;
        this.mode = mode;
        this.timeSignature = timeSignature;
        this.acousticness = acousticness;
        this.danceability = danceability;
        this.energy = energy;
        this.instrumentalness = instrumentalness;
        this.liveness = liveness;
        this.loudness = loudness;
        this.speechiness = speechiness;
        this.valence = valence;
        this.tempo = tempo;
    }

    public Song() {}

    @Override
    public String toString() {
        return songName + " - " + artistName;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getExplicit() {
        return explicit;
    }

    public void setExplicit(String explicit) {
        this.explicit = explicit;
    }

    public String getSongType() {
        return songType;
    }

    public void setSongType(String songType) {
        this.songType = songType;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getNumArtists() {
        return numArtists;
    }

    public void setNumArtists(String numArtists) {
        this.numArtists = numArtists;
    }

    public String getNumAvailableMarkets() {
        return numAvailableMarkets;
    }

    public void setNumAvailableMarkets(String numAvailableMarkets) {
        this.numAvailableMarkets = numAvailableMarkets;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(String durationMs) {
        this.durationMs = durationMs;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getTimeSignature() {
        return timeSignature;
    }

    public void setTimeSignature(String timeSignature) {
        this.timeSignature = timeSignature;
    }

    public String getAcousticness() {
        return acousticness;
    }

    public void setAcousticness(String acousticness) {
        this.acousticness = acousticness;
    }

    public String getDanceability() {
        return danceability;
    }

    public void setDanceability(String danceability) {
        this.danceability = danceability;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getInstrumentalness() {
        return instrumentalness;
    }

    public void setInstrumentalness(String instrumentalness) {
        this.instrumentalness = instrumentalness;
    }

    public String getLiveness() {
        return liveness;
    }

    public void setLiveness(String liveness) {
        this.liveness = liveness;
    }

    public String getLoudness() {
        return loudness;
    }

    public void setLoudness(String loudness) {
        this.loudness = loudness;
    }

    public String getSpeechiness() {
        return speechiness;
    }

    public void setSpeechiness(String speechiness) {
        this.speechiness = speechiness;
    }

    public String getValence() {
        return valence;
    }

    public void setValence(String valence) {
        this.valence = valence;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
}
