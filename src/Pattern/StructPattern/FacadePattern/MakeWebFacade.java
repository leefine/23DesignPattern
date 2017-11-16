package Pattern.StructPattern.FacadePattern;

/***
 * 网站开发项目组
 */
public class MakeWebFacade {
    private WebBackendGroup webBackendGroup;
    private WebFrontGroup webFrontGroup;

    public MakeWebFacade() {
        webBackendGroup = new WebBackendGroup();
        webFrontGroup = new WebFrontGroup();
    }

    //正常开发流程 先进行原型设计和前端开发再进行后端开发
    public void MakeAProject() {
        webFrontGroup.makePrototype();
        webFrontGroup.makeHtmlPage();
        webFrontGroup.makeCSS();

        webBackendGroup.makeDAO();
        webBackendGroup.makeService();
        webBackendGroup.makeController();
    }

    //由于前端工程师业务繁忙 特殊项目先进行后端开发
    public void MakeBProject() {
        webBackendGroup.makeDAO();
        webBackendGroup.makeService();
        webBackendGroup.makeController();

        webFrontGroup.makePrototype();
        webFrontGroup.makeCSS();
        webFrontGroup.makeHtmlPage();
    }

    //由前端工程师负责静态网站的开发
    public void MakeCProject() {
        webFrontGroup.makePrototype();
        webFrontGroup.makeCSS();
        webFrontGroup.makeHtmlPage();
    }



    public static void main(String[] args) {
        // 由于Facade的作用，客户端可以根本不知道子系统类的存在

        MakeWebFacade facade = new MakeWebFacade();
        facade.MakeAProject();
        facade.MakeBProject();
        facade.MakeCProject();
    }
}