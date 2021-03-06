/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
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
package gwt.material.design.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.html.ListItem;

//@formatter:off

/**
 * FAB List container element to define every FAB items
 *
 * @author kevzlou7979
 * @author Ben Dol
 * @see <a href="http://gwtmaterialdesign.github.io/gwt-material-demo/#buttons">Material FAB</a>
 * @see <a href="https://material.io/guidelines/components/buttons-floating-action-button.html">Material Design Specification</a>
 *///@formatter:on
public class MaterialFABList extends MaterialWidget {

    public MaterialFABList() {
        super(Document.get().createULElement());
    }

    @Override
    public void add(Widget child) {
        super.add(new ListItem(child));
    }
}
