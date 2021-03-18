import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

class VistaElegircantidad extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-select value="Item one" id="select-cantidad">
  <template>
   <vaadin-list-box selected="0">
    <vaadin-item selected>
     Cantidad
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
`;
    }

    static get is() {
        return 'vista-elegircantidad';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaElegircantidad.is, VistaElegircantidad);
