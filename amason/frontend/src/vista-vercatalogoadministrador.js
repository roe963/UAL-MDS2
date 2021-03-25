import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-productos.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import './vista-buscarproductoadministrador.js';

class VistaVercatalogoadministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xl);">
  <h4>Catálogo</h4>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vista-buscarproductoadministrador style="flex-grow: 1; margin-right: var(--lumo-space-xl);"></vista-buscarproductoadministrador>
   <vaadin-select value="Item one" id="select-categoria" style="flex-grow: 1;">
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
  </vaadin-horizontal-layout>
  <vista-productos style="align-self: stretch;"></vista-productos>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercatalogoadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercatalogoadministrador.is, VistaVercatalogoadministrador);
