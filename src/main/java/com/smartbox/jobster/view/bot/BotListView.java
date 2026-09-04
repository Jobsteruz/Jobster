package com.smartbox.jobster.view.bot;

import com.smartbox.jobster.entity.ref.Setting;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.Menu;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.service.tg.BotService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.bot.tgchannel.TgChannelListView;
import com.smartbox.jobster.view.bot.users.BotUsersView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.menu.MenuListView;
import com.smartbox.jobster.view.ref.setting.SettingListView;
import com.vaadin.flow.component.grid.ItemClickEvent;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.action.ActionVariant;
import io.jmix.flowui.kit.action.BaseAction;
import io.jmix.flowui.view.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "bots", layout = MainView.class)
@ViewController("jb_TgBot.list")
@ViewDescriptor("bot-list-view.xml")
public class BotListView extends AbstractListView<Bot> {


    @ViewComponent("entityDataGrid.status")
    private BaseAction botsDataGridStatus;

    @Autowired
    private BotService botService;
    @ViewComponent
    private MessageBundle messageBundle;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addStatusColumn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid")
    public void onEntityDataGridItemDoubleClick(final ItemDoubleClickEvent<?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid")
    public void onBotsDataGridItemClick(final @NotNull ItemClickEvent<Bot> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.menu")
    public void onBotsDataGridMenu(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void navigateMenu() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.settings")
    public void onEntityDataGridSettings(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.botUsers")
    public void onEntityDataGridBotUsers(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.channels")
    public void onEntityDataGridChannels(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.status")
    public void onBotsDataGridStatus(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void makeStartBtn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void makeStopBtn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}