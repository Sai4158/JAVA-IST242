/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ffonseca
 */
class NavModel
{

    private WordData wd;

    public NavModel()
    {
        wd = new WordData();
    }

    public WordData getWordData()
    {
        return wd;
    }

    public void setWordData(WordData wd)
    {
        this.wd = wd;
    }

}
