package com.vaadin.componentfactory;

/*-
 * #%L
 * TreeComboBox
 * %%
 * Copyright (C) 2020 Vaadin Ltd
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.vaadin.tatu.Tree;

import java.util.Random;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Focusable;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.HasHelper;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasValidation;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.shared.HasTooltip;
import com.vaadin.flow.component.shared.Tooltip;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.provider.hierarchy.HasHierarchicalDataProvider;
import com.vaadin.flow.data.provider.hierarchy.HierarchicalDataProvider;
import com.vaadin.flow.data.provider.hierarchy.HierarchicalQuery;
import com.vaadin.flow.data.provider.hierarchy.TreeData;
import com.vaadin.flow.data.provider.hierarchy.TreeDataProvider;
import com.vaadin.flow.data.selection.SingleSelect;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.function.SerializablePredicate;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.theme.lumo.LumoIcon;

/**
 * This is hierarchical ComboBox type single select component. It currently
 * works with in-memory data providers, i.e. TreeDataProvider, it supports
 * filtering, but not adding new items on the fly.
 *
 * @author Tatu Lund
 *
 * @param <T>
 *            Bean type used in TreeData
 */
@Tag("div")
public class TreeComboBox<T> extends AbstractField<TreeComboBox<T>, T>
        implements SingleSelect<TreeComboBox<T>, T>,
        HasHierarchicalDataProvider<T>, Focusable<TreeComboBox<T>>, HasSize,
        HasElement, HasValidation, HasHelper, HasTooltip {

    public enum FilterMode {

        EXACT, STARTS_WITH, CONTAINS, EXACT_CASE, STARTS_WITH_CASE, CONTAINS_CASE
    }
    private ValueProvider<T, String> valueProvider;

    private Random rand = new Random();
    private TextField filterField = new TextField();
    private Button openButton = new Button();
    private Popup popup = new Popup();
    private Tree<T> tree = null;
    private FilterMode filterMode = FilterMode.CONTAINS;
    private String id;

    /**
     * Constructs a new TreeComboBox Component.
     *
     * @param valueProvider
     *            the item caption provider to use, not <code>null</code>
     */
    public TreeComboBox(ValueProvider<T, String> valueProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void selectFilteredItem(T item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Constructs a new TreeComboBox Component with given caption and
     * {@code TreeData}.
     *
     * @param valueProvider
     *            the item caption provider to use, not <code>null</code>
     * @param treeData
     *            the tree data for component
     */
    public TreeComboBox(TreeData<T> treeData,
                        ValueProvider<T, String> valueProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Constructs a new TreeComboBox Component with given caption and
     * {@code TreeDataProvider}.
     *
     * @param valueProvider
     *            the item caption provider to use, not <code>null</code>
     * @param dataProvider
     *            the hierarchical data provider for component
     */
    public TreeComboBox(TreeDataProvider<T> dataProvider,
                        ValueProvider<T, String> valueProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setValue(T value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public T getValue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Sets the width of the Popup part.
     * <p>
     * Note: If setWidth is used, the Popup width be reset to width defined by
     * setWidth.
     *
     * @param width
     *            the width to be set
     */
    public void setPopupWidth(String width) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setDataProvider(DataProvider<T, ?> dataProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public HierarchicalDataProvider<T, SerializablePredicate<T>> getDataProvider() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setRequiredIndicatorVisible(boolean requiredIndicatorVisible) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean isRequiredIndicatorVisible() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setReadOnly(boolean readOnly) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean isReadOnly() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void focus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * String used for the label element.
     *
     * @param label
     *            the String value to set
     */
    public void setLabel(String label) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Sets the width of the component.
     * <p>
     * The width should be in a format understood by the browser, e.g. "100px"
     * or "2.5em".
     * <p>
     * If the provided {@code width} value is {@literal null} then width is
     * removed.
     * <p>
     * Note: The content in popup needs an explicit width, hence "100%" does not
     * work.
     *
     * @param width
     *            the width to set, may be {@code null}
     */
    @Override
    public void setWidth(String width) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setDataProvider(
            HierarchicalDataProvider<T, ?> hierarchicalDataProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void setPresentationValue(T newPresentationValue) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * When true allow selecting only the leaf nodes
     *
     * @param selectOnlyLeafs
     *            boolean value.
     */
    public void setSelectOnlyLeafs(boolean selectOnlyLeafs) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Set icon as prefix component of the field.
     *
     * @param component
     *            Preferably a icon component
     */
    public void setIcon(Component component) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * When false clear button will not be visible, default true.
     *
     * @param clearButtonVisible
     *            boolean value.
     */
    public void setClearButtonVisible(boolean clearButtonVisible) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * When set to true, user cannot type into input field, only select values
     * from the popup.
     *
     * @param disableFiltering
     *            boolean value
     */
    public void setDisableFiltering(boolean disableFiltering) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String randomId(String prefix, int chars) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setErrorMessage(String errorMessage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getErrorMessage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setInvalid(boolean invalid) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean isInvalid() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setHelperText(String helperText) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getHelperText() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setHelperComponent(Component helperComponent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Component getHelperComponent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Tooltip setTooltipText(String tooltipText) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Tooltip getTooltip() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
