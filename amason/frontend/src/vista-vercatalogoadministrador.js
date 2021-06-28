import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import './vista-productoscategoriaadministrador.js';

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
 <vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xl);">
  <h4>Catálogo</h4>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1;">
    <vaadin-text-field placeholder="Search" id="textfield-buscar" style="flex-grow: 1;">
     <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
    </vaadin-text-field>
    <vaadin-button theme="icon" aria-label="Search" id="button-buscar">
     <iron-icon icon="lumo:search"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="layout-selectCategoria" style="flex-grow: 1;">
    <vaadin-select value="Item one">
     <template>
      <vaadin-list-box>
       <vaadin-item selected>
         Item one 
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
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-grow: 1; align-self: stretch;">
   <vista-productoscategoriaadministrador style="flex-grow: 1; align-self: stretch;"></vista-productoscategoriaadministrador>
  </vaadin-horizontal-layout>
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
