package ru.netology.postermanager;

public class Manager {
    private String filmName;
    private int countFilms;
    private String[] films = new String[0];

    public Manager(int countFilms) {
        this.countFilms = countFilms;
    }

    public Manager() {
        countFilms = 10;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getCountFilms() {
        return countFilms;
    }

    public void setCountFilms(int countFilms) {
        this.countFilms = countFilms;
    }

    public void addFilm(String film) {
        String [] tmp = new String[films.length + 1];
        for(int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (countFilms < films.length) {
            resultLength = countFilms;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }


}
