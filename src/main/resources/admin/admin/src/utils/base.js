const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot1mi5m/",
            name: "springboot1mi5m",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot1mi5m/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "餐厅点餐系统"
        } 
    }
}
export default base
