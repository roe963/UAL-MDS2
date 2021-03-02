import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-elegircantidad`
 *
 * VistaElegircantidad element.
 *
 * @customElement
 * @polymer
 */
class VistaElegircantidad extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
