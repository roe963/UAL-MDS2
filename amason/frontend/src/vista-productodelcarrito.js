import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

class VistaProductodelcarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 18%;">
 <vaadin-vertical-layout theme="spacing">
  <img style="padding: var(--lumo-space-xl);">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="padding-left: var(--lumo-space-xl);">
  <vaadin-list-box>
   <h4>Producto</h4>
   <label>Categoría</label>
  </vaadin-list-box>
  <vaadin-select value="Item one">
   <template>
    <vaadin-list-box selected="0">
     <vaadin-item selected>
      1
     </vaadin-item>
     <vaadin-item>
      2
     </vaadin-item>
     <vaadin-item>
      3
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: flex-end; padding-left: var(--lumo-space-xl);">
  <vaadin-button>
   Eliminar
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 0; padding-right: var(--lumo-space-xl);">
  <vaadin-list-box style="align-self: center;">
   <label style="flex-grow: 0;">Precio</label>
   <h4>0,00€</h4>
  </vaadin-list-box>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productodelcarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductodelcarrito.is, VistaProductodelcarrito);
