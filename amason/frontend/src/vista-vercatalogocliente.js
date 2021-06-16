import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import './vista-productoscategoriacliente.js';

class VistaVercatalogocliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xl);">
  <h4>Catálogo</h4>
  <vaadin-vertical-layout id="layout-selectCategoria">
   <vaadin-select value="Item one" id="select-categoria">
    <template>
     <vaadin-list-box selected="0">
      <vaadin-item selected>
        Categoría 
      </vaadin-item>
      <vaadin-item>
        Item two 
      </vaadin-item>
      <vaadin-item>
        Item three 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: stretch; flex-grow: 1;">
   <vista-productoscategoriacliente style="flex-grow: 1; align-self: stretch;"></vista-productoscategoriacliente>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercatalogocliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercatalogocliente.is, VistaVercatalogocliente);
