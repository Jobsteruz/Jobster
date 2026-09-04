package com.smartbox.jobster.view.abstractview;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.service.NavigationService;
import org.json.JSONObject;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.List;

/**
 * @author Jobster team
 * date: 10/08/24 12:44
 */
public interface NavigationSupport extends HasParamView {


    void setNavigation(Navigation navigation);

    Navigation getNavigation();


    @NonNull
    default JSONObject params() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    default List<ViewParam> navViewParams() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

//    default void updateBadge() {
//        if (getNavigation() != null)
//            $.currentUI().ifPresent(ui -> ui.getPage().executeJs("[не публикуется]", getNavigation().getCrcId(), AppBeans.get(NavigationService.class).updateBadge(getNavigation())));
//    }
}
