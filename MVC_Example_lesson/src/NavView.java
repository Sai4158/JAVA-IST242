/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ffonseca
 */
class NavView
{

    private InitialFrame iframe;

    NavView()
    {
        iframe = new InitialFrame();
    }

    public InitialFrame getInitialframe()
    {
        return iframe;
    }

    public void setInitialframe(InitialFrame iframe)
    {
        this.iframe = iframe;
    }

}
