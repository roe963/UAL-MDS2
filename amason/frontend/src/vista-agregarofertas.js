import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-agregarofertas`
 *
 * VistaAgregarofertas element.
 *
 * @customElement
 * @polymer
 */
class VistaAgregarofertas extends PolymerElement {

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
        return 'vista-agregarofertas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAgregarofertas.is, VistaAgregarofertas);
