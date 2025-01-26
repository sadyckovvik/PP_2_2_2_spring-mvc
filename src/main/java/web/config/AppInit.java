package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//позволяет полностью отказаться от XML-конфигурации web.xml
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на класс конфигурации
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // Корневой контекст не используется
        //В этом случае все бины будут загружены в контекст DispatcherServlet.
    }


    // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class // Конфигурация для DispatcherServlet
        };
    }


    /* Данный метод указывает url, на котором будет базироваться приложение */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; // Обрабатывать все запросы
    }

}