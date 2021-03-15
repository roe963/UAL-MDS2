import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';

class VistaProductosdelcarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 23%;">
 <vaadin-vertical-layout style="align-self: center;">
  <img style="padding: var(--lumo-space-xl);">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="align-self: flex-end;">
  <vaadin-list-box>
   <vaadin-item>
     Producto 
   </vaadin-item>
   <vaadin-item>
     Categoria 
   </vaadin-item>
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
 <vaadin-vertical-layout style="align-self: flex-end; flex-grow: 1;">
  <vaadin-button style="flex-grow: 0;">
    Button 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; justify-content: flex-end; flex-grow: 0; align-self: flex-start;">
  <vaadin-list-box>
   <vaadin-item>
     Precio 
   </vaadin-item>
   <vaadin-item>
     0,00€ 
   </vaadin-item>
  </vaadin-list-box>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productosdelcarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosdelcarrito.is, VistaProductosdelcarrito);
